function main()
	print("French or English / Français ou anglais (fr/en) ")
	local answ = io.read()
	if (answ == "fr" or answ == "francais" or answ == "français" or answ == "french") then
		french()
	elseif (answ == "en" or answ == "english" or answ == "anglais") then
		english()
	else
		print("[ERROR] Enter something valid / Entres une valeur correcte")
	end
end



function french()
	local day = 0
	local month = 0
	local year = 0
	local result = 0
	local days = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"} -- WARNING : Arrays start at index 1!
	
	print("Entrer le jour, mois, et année (ex : 12,11,24 pour 12/11/2024) ")
	day, month, year = io.read():match("(%d+),(%d+),(%d+)")
	day, month, year = tonumber(day), tonumber(month), tonumber(year)	
	
	print("Le jour est  "..day..", le mois est "..month..", l'année est "..year.." ("..day.."/"..month.."/"..year..")")	
	
	result = (day + (13 * (month + 1) // 5) + 21 + 5 + 5 - 10  ) % 7
	result = result+1	

	print("Le jour est "..days[result].." ("..result..")")
end



function english()
	local day = 0
	local month = 0
	local year = 0
	local result = 0
	local days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"} -- WARNING : Arrays start at index 1!
	
	print("Enter Day, Month, and Year (eg : 12,11,24 for 12/11/2024)")
	day, month, year = io.read():match("(%d+),(%d+),(%d+)")
	day, month, year = tonumber(day), tonumber(month), tonumber(year)	
	
	
	
	print("Day is "..day..", Month is "..month..", Year is "..year.." ("..day.."/"..month.."/"..year..")")	
	
	result = (day + (13 * (month + 1) // 5) + 21 + 5 + 5 - 10  ) % 7
	result = result+1
	
	print("Day is "..days[result].." ("..result..")")
end

main()
